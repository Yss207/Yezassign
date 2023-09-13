//java program for getter and setter
class Something{
      private String name;
      
      public void setName(String n){
            this.name = n;
      }
      
      public String getName(){
           return name;
      }
      
}

class ABC{
      public static void main(String args[]){
            Something n1 = new Something();
            
            n1.setName("Yash");
            
            System.out.println("Name is: "+n1.getName());
            }
        }

