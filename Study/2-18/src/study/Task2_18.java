package study;

public class Task2_18 {
    public static void main(String[] args) {
    //問② Personクラスをインスタンス化し、名前「山田太郎」 年齢「23」 住所「東京都」 をカプセル化されたsetterで設定して下さい。
    Person person =new Person();
    
    person.setName("山田太郎");
    person.setAge(23+"才");
    person.setAddress("東京都");
    
    //問③ 設定した名前・年齢・住所をカプセル化されたgetterで呼び出してして下さい。
    System.out.println("名前は、"+person.getName()+"です。");
    System.out.println("年齢は、"+person.getAge()+"です。");
    System.out.println("住所は、"+person.getAddress()+"です。");
    
    
    }
}

class Person {
    private String name;
    private String age;
    private String address;
    //問① 上記変数に従って、getterとsetterを設定して下さい。
    public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
    }
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
    
}
