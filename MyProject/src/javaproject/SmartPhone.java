package javaproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartPhone {
    String name, phone, email, address, birth, group;
    
    List<Contact> contacts = new ArrayList<Contact>();
    
    void addContact(){
    	Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.print("이름을 입력해주세요 : ");
        name = sc.nextLine();
        System.out.print("전화번호를 입력해주세요 : ");
        phone = sc.nextLine();
        System.out.print("이메일을 입력해주세요 : ");
        email = sc.nextLine();
        System.out.print("주소를 입력해주세요 : ");
        address = sc.nextLine();
        System.out.print("생일을 입력해주세요 : ");
        birth = sc.nextLine();
        System.out.print("그룹을 입력해주세요 : ");
        group = sc.nextLine();
        System.out.println("--------------------");
        
        Contact person = new Contact(name, phone, email, address, birth, group);
        
        contacts.add(person);
    }
    
    void showContact() {
        System.out.println("연락처 리스트를 보여드립니다");
        System.out.println("--------------------");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i+1) + " " + contacts.get(i).getName());
        }
        System.out.println("현재 저장된 리스트 : " + contacts.size() + "명");
        System.out.println("--------------------");
    }
    
    void delContact() {
    	System.out.println("리스트를 보여드립니다. ");
    	showContact();
    	System.out.printf("삭제할 사람의 이름을 입력해주세요. : ");
    	Scanner sc = new Scanner(System.in);
    	String mname;
    	mname = sc.nextLine();
    	
    	for (int i = 0; i < contacts.size(); i++) {
            if(mname.equals(contacts.get(i).getName())){
            	contacts.remove(i);
            }
        }
    	System.out.println("삭제 되었습니다.");
    	System.out.println("--------------------");
    }

    void findContact() {
    	System.out.printf("찾고자 하는 사람의 이름을 입력해주세요 : ");
    	Scanner sc = new Scanner(System.in);
    	String mname;
    	mname = sc.nextLine();
    	
    	for (int i = 0; i < contacts.size(); i++) {
            if(mname.equals(contacts.get(i).getName())){
            	System.out.println(contacts.get(i).getName() + "님은 " + (i+1) + "에 저장되어있습니다.");
            }
        }
    }
    
    void modifyContact() {
    	System.out.printf("수정하고 싶은 사람의 이름을 입력해주세요 : ");
    	Scanner sc = new Scanner(System.in);
    	String mname;
    	mname = sc.nextLine();
    	
    	for (int i = 0; i < contacts.size(); i++) {
            if(mname.equals(contacts.get(i).getName())){
            	
            	System.out.printf("수정할 목록을 입력해주세요 : ");
            	System.out.println("1. 이름  2. 전화번호  3. 이메일  4. 주소  5. 생일  6. 그룹");
            	int input;
            	input = Integer.parseInt(sc.nextLine());
            	
            	switch(input) {
            	case 1 : 
                	name = sc.nextLine();
                	contacts.get(i).setName(name);
                	System.out.println(contacts.get(i).getName());
                	break;
            	case 2 : 
            		phone = sc.nextLine();
                	contacts.get(i).setName(phone);
                	System.out.println(contacts.get(i).getPhone());
                	break;
            	case 3 : 
            		email = sc.nextLine();
                	contacts.get(i).setName(email);
                	System.out.println(contacts.get(i).getEmail());
                	break;
            	case 4 : 
            		address = sc.nextLine();
                	contacts.get(i).setName(address);
                	System.out.println(contacts.get(i).getAddress());
                	break;
            	case 5 : 
            		birth = sc.nextLine();
                	contacts.get(i).setName(birth);
                	System.out.println(contacts.get(i).getBirth());
                	break;
            	case 6 : 
                	group = sc.nextLine();
                	contacts.get(i).setName(group);
                	System.out.println(contacts.get(i).getGroup());
                	break;
                	
            	}
            }
        }
    	
    }
}