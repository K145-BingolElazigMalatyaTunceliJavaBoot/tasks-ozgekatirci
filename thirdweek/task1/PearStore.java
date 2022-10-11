package firstweektask1.thirdweek.task1;

public class PearStore extends Store implements FruitShoppingService{
    Pear p=new Pear();

    @Override
    public void addFruit(int quantity) {
        int newQuantity;
        newQuantity=p.getQuantity()+quantity;
        p.setQuantity(newQuantity);
    }

    @Override
    public void buyFruit(int quantity) {
        if(quantity>p.getQuantity()){
            System.out.println("Not enough apples in stock! You can only buy "+p.getQuantity()+" pears.");
        }
        else{
            int newQuantity;
            newQuantity=p.getQuantity()-quantity;
            p.setQuantity(newQuantity);
        }
    }

    @Override
    public int getFruitQuantity() {
        return p.getQuantity();
    }
}
