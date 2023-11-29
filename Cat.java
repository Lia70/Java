
public class Cat {

    public String name;
    public int age;
    public String poroda;
    public String owner;
    
    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", poroda: " + poroda + ", owner: " + owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Cat)){
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && age == cat.age && poroda.equals(cat.poroda) && owner.equals(cat.owner);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*age + 13*poroda.hashCode() + 17*owner.hashCode();
    }
}
