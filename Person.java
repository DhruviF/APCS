public class Person implements Comparable<Person>{
  private String name;
  private int age;
  private double weight;

  public Person(String initialName, int initialAge, double initialWeight){
    name = initialName;
    age = initialAge;
    weight = initialWeight;
  }

  public int compareTo(Person p){
    if (this.name.compareTo(p.name) < 0){
      return -1;
    }else if (this.name.compareTo(p.name) > 0){
      return 1;
    }else{
      if(this.age > p.age){
        return 1;
      }else if (this.age < p.age){
        return -1;
      }else{
        if(this.weight > p.weight){
          return 1;
        }else if (this.weight < p.weight){
          return -1;
        }else{
          return 0;
        }
      }
    }
  }

  public Person(){

  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public double getWeight(){
    return weight;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public String toString(){
    return "{" + this.name + ", " + this.age + ", " + this.weight + "}";
  }

}
