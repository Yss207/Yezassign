import java.util.*;

class Gp{
    public static void main(String[] args) {

        int count1 = 0;//for even
        int count2 = 0;//for odd
        int count3 = 0;//count3 for prime number & count4 for palindrome
        int count4 = 0;

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(4);
        ints.add(5);
        ints.add(7);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> prime = new ArrayList<>();

        String rev = "";
        ArrayList<String> strng = new ArrayList<>();
        strng.add("TENET");

        ArrayList<String> revstrng = new ArrayList<>();

        for(int i = 0; i<ints.size(); i++){
            if(ints.get(i)%2 == 0){
                even.add(ints.get(i));
                count1++;
            }
            else{
                odd.add(ints.get(i));
                count2++;
            }
        }

        for(int j = 0; j<ints.size(); j++){
            int m = ints.get(j) / 2;
            for(int x = 2; x<=m; x++){
                if(ints.get(j)%x == 0){
                    break;
                }
                else{
                    prime.add(ints.get(j));
                    count3++;
                    break;
                }
                
            }
            
        }

        //Palindrome
        


        for(int k = 0; k<strng.size(); k++){
            String temp = strng.get(k);

            for(int z = 0; z<temp.length(); z++){
                rev = temp.charAt(z) + rev;
                if(temp==rev){
                    System.out.println("HELL");
                    count4++;
                    break;
                }
            }
            
                
               
        }

        System.out.println(even);
        System.out.println(odd);
        System.out.println(prime);
        System.out.println(revstrng);
    }
}
