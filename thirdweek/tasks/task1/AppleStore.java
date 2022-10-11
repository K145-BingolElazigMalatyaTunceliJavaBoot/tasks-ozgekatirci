package firstweektask1.thirdweek.tasks.task1;

public class AppleStore extends Store implements FruitShoppingService {
    Apple a=new Apple();

    @Override
    public void addFruit(int quantity) {
        int newQuantity;
        newQuantity=a.getQuantity()+quantity;
        a.setQuantity(newQuantity);
    }

    @Override
    public void buyFruit(int quantity) {
        if(quantity>a.getQuantity()){
            System.out.println("Not enough apples in stock! You can only buy "+a.getQuantity()+" apples.");
        }
        else{
            int newQuantity;
            newQuantity=a.getQuantity()-quantity;
            a.setQuantity(newQuantity);
        }
    }

    @Override
    public int getFruitQuantity() {
        return a.getQuantity();
    }
}
