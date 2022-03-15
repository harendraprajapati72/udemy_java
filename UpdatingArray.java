import java.io.StreamCorruptedException;
import java.util.Arrays;

public class UpdatingArray {
    public static void main(String[] args) {
        String [] menu={"Espresso","Iced Coffee","Macchiato"};
        // String menuString=Arrays.toString(menu);
        // System.out.println(menuString);
        menu[2]="latte";//updating array 
        System.out.println(Arrays.toString(menu));

        String[] newMenu=new String[5];//define array length
        for(int i=0;i<menu.length;i++){
            // System.out.println(i +". "+menu[i]);
            newMenu[i]=menu[i]; //copy the content of array menu to newMenu
        }
        newMenu[3]="House Blend";//updating the String
        newMenu[4]="Dark Roast";//updating the String
        System.out.println(Arrays.toString(newMenu));
    } 
    
}
 