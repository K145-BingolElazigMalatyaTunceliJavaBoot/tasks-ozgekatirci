package firstweektask1.thirdweek.task1;

public class CherryStore extends Store implements FruitShoppingService{
    Cherry c=new Cherry();


    @Override
    public void addFruit(int quantity) {
        int newQuantity;
        newQuantity=c.getQuantity()+quantity;
        c.setQuantity(newQuantity);
    }

    @Override
    public void buyFruit(int quantity) {
        if(quantity>c.getQuantity()){
            System.out.println("Not enough apples in stock! You can only buy "+c.getQuantity()+" cherries.");
        }
        else{
            int newQuantity;
            newQuantity=c.getQuantity()-quantity;
            c.setQuantity(newQuantity);
        }
    }

    @Override
    public int getFruitQuantity() {
        return c.getQuantity();
    }


}
