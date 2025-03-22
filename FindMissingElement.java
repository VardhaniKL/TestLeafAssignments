package arrayAssignment;

public class FindMissingElement {
    public static void main(String[] args) {
        int[] a = {1, 4, 3, 2, 8,6,7}; 

        boolean found;

        for (int i = 1; i <= a.length+1; i++) { 
            found = false; 
            
            for (int j = 0; j < a.length; j++) { 
                if (a[j] == i) {
                    found = true; 
                    break;
                }
            }

            if (!found) { 
                System.out.println("The missing number is: " + i);

            }
        }
    }
}