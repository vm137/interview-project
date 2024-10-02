# BNP Paribas interview

## 1. Analyze code (15 min )

Tell what you would change here and why.

```java
public class UserDao {
    private Provider<Session> sessionProvider;
    
    public UserDao() {
        this.sessionProvider = new DbSessionProvider();
    }
    
    public boolean saveUser(User user, ApiConfig config) {
        try {
            Session session = sessionProvider.get();
            session.save(user);
            System.out.println("User saved!");
            return true;
        } catch (DbException e) {
            EmailUtil.sendEmail(config.getTechnicalSupportEmail(), e);
            return false;
        }
    }
}
```

## 2. Live coding task (25 min)

- Implement cache with limited size, that brings lastly used item to the top of the stack, and the oldest used item gets
  deleted when cache is overloaded.
- Propose datastructures for this type of cache, explain your choice.
- Describe test cases that would be appropriate for this class, and write them in IDE.

the cache should work like the following:

```text
var cache = new Cache(3);
cache.put("ISIN1", price1);
cache.put("ISIN2", price2);
cache.put("ISIN3", price3);
cache.get("ISIN1");  // returns price1
cache.put("ISIN4", price4); // size is reached, ISIN2 will be removed
cache.get("ISIN2");  // returns null;
```

## 3. What will be the result of this code.

Explain why, tell about types of iterators you know.

```java
class App {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Iterator<Integer> itr = integers.iterator();
        
        while (itr.hasNext()) {
            Integer a = itr.next();
            integers.remove(a);
        }        
    }
}
```

## 4. Write implementation of thead-safe Singleton class
