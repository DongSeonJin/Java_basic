package poly.instanceof_;

public class Cup {
	
	private String itemName; // 상품명
	private int price; // 가격
	private String companyName; // 제조사
	
	public Cup(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
		this.companyName = "컵회사";
	}
	
	public Cup() {
		this("입력안됨", 0);
		
	}
}
