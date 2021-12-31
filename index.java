import java.util.Scanner;
class Library{
    public static void main(String args[]){
        String BookName,WriterName;
        Float Price,TotalPrice;
        int Quantity , BookId, pos=0,found=0;
        //Accepting Values For Variables
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter BookName");
        BookName=sc.nextLine();
        System.out.println("Enter Writer Name");
        WriterName=sc.nextLine();
        System.out.println("Enter Book ID");
        BookId=sc.nextInt();
        System.out.println("Enter Price");
        Price=sc.nextFloat();
        System.out.println("Enter Quantity");
        Quantity=sc.nextInt();
        if(Quantity<=50){
            System.out.println("Books Available");
            TotalPrice=Quantity*Price;
            System.out.println("Total Price=" +TotalPrice);
            
        }
        else{
        System.out.println("Quantity of books required not available");
        System.out.println("Sorry 🥺");
    
        }

}
}   
