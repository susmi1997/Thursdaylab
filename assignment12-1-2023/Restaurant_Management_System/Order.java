package Restaurant;

public class Order {
	int orderId;
	String orderName;
	double price;
	int quantity;
	double price1;
	double totalInd;
	String name;
	
	public Order(int orderId, String orderName, double price )
	{
		super();
		this.orderId=orderId;
		this.orderName=orderName;
		this.price=price;
	}
	public Order(int quantity, double price1, double totalInd, String name)
	{
		this.quantity=quantity;
		this.price1=price1;
		this.totalInd=totalInd;
		this.name=name;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice1() {
		return price1;
	}
	public void setPrice1(double price1) {
		this.price1 = price1;
	}
	public double getTotalInd() {
		return totalInd;
	}
	public void setTotalInd(double totalInd) {
		this.totalInd = totalInd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	


}
