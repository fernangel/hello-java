package ru.mera.�hizhkin_roman.postman;

public class test {
	public static void main(String[] args) {
		int sum1 = 0,  sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, max = 0, place1 = 0, place2 = 0;
		AbstractItem [] arr = new AbstractItem[300];
		arr[0] = new Circular_saw("������", 6000, 2, 2000, 100);
		arr[1] = new Drill("������", 3400, 4, 1500, 5);
		arr[2] = new Jigsaw("�����", 2500, 3, 2100, 100);
		arr[3] = new Circular_saw("������", 8000, 1, 2700, 120);
		arr[4] = new Laptop("Intel Pentium", 15000, 5, 8, 1, 4, 17.5f, 2);
		arr[5] = new Laptop("AMD Athlon", 21000, 1, 16, 2, 8, 19.5f, 3);
		arr[6] = new Monoblock("Intel Celeron", 10000, 2, 4, 1, 2);
		arr[7] = new Jigsaw("�������", 2200, 1, 1700, 90);
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Circular_saw) {
				sum1 +=	 arr[i].getCount()*arr[i].getQuantity();
				System.out.println("���� " + arr[i].getName() + " " +arr[i].getCount() + " ��� " +arr[i].getQuantity() + " �� " + ((Electro_tool) arr[i]).getPower_consumption() + " ���� � ������ �������� ����� " + ((Circular_saw) arr[i]).getRadius() + " ��");
				if (max < ((Electro_tool) arr[i]).getPower_consumption()) {
					max = ((Electro_tool) arr[i]).getPower_consumption();
				}
			}
			else if (arr[i] instanceof Drill) {
				sum2 +=	 arr[i].getCount()*arr[i].getQuantity();
				System.out.println("����� " + arr[i].getName() + " " +arr[i].getCount() + " ��� " +arr[i].getQuantity() + " �� " + ((Electro_tool) arr[i]).getPower_consumption() + " ���� � ������������ ������� ������ " + ((Drill) arr[i]).getDiameter() + " ��");
				if (max < ((Electro_tool) arr[i]).getPower_consumption()) {
					max = ((Electro_tool) arr[i]).getPower_consumption();
				}
			}
			else if (arr[i] instanceof Jigsaw) {
				sum3 +=	 arr[i].getCount()* arr[i].getQuantity();
				System.out.println("������ " + arr[i].getName() + " " +arr[i].getCount() + " ��� " +arr[i].getQuantity() + " �� " + ((Electro_tool) arr[i]).getPower_consumption() + " ���� � ������������ ������� ������� " + ((Jigsaw) arr[i]).getThickness() + " ��");
				if (max < ((Electro_tool) arr[i]).getPower_consumption()) {
					max = ((Electro_tool) arr[i]).getPower_consumption();
				}
			}
			else if (arr[i] instanceof Laptop) {
				sum4 +=	 arr[i].getCount()* arr[i].getQuantity();
				System.out.println("������� " + arr[i].getName() + " " +arr[i].getCount() + " ��� " +arr[i].getQuantity() + " �� " + ((Computer) arr[i]).getMemory() + " GB " + ((Computer) arr[i]).getHard_disk_space() + " TB " + ((Computer) arr[i]).getCPU_cores() + " CPU " + ((Laptop) arr[i]).getDiagonal() + " ������ ���� ������ " + ((Laptop) arr[i]).getTime() + " ���(�)");
				place1 += arr[i].getQuantity()*((Computer) arr[i]).getHard_disk_space(); 
			}
			else if (arr[i] instanceof Monoblock) {
				sum5 +=	 arr[i].getCount()* arr[i].getQuantity();
				System.out.println("�������� " + arr[i].getName() + " " +arr[i].getCount() + " ��� " +arr[i].getQuantity() + " �� " + ((Computer) arr[i]).getMemory() + " GB " + ((Computer) arr[i]).getHard_disk_space() + " TB " + ((Computer) arr[i]).getCPU_cores() + " CPU " );
				place2 += arr[i].getQuantity()*((Computer) arr[i]).getHard_disk_space();
			}
		}
		int sum_all = sum1+sum2+sum3+sum4+sum5;
		int place_all = place1 + place2;
		System.out.println(sum_all + " ������ (��������� ���� �������)");
		System.out.println(max + " ����  (���������� �������� ��������)");
		System.out.println(place_all + " TB (����� ����� �� ������� ����� ��� ���� �����������)");
		System.out.println("���� ����� ������� ����� 21 ����. ����� ������� � ���.");
		System.out.println("����� ����� ������� ����� 14 ����. ����� ���.");
		System.out.println("������� ����� ������� ����� 14 ����. ����� ������� � ���.");
		
			
		}
		
	}
