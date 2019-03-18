package ru.mera.сhizhkin_roman.postman;

public class test {
	public static void main(String[] args) {
		int sum1 = 0,  sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, max = 0, place1 = 0, place2 = 0;
		AbstractItem [] arr = new AbstractItem[300];
		arr[0] = new Circular_saw("Дружба", 6000, 2, 2000, 100);
		arr[1] = new Drill("Грызун", 3400, 4, 1500, 5);
		arr[2] = new Jigsaw("Вепрь", 2500, 3, 2100, 100);
		arr[3] = new Circular_saw("Баньши", 8000, 1, 2700, 120);
		arr[4] = new Laptop("Intel Pentium", 15000, 5, 8, 1, 4, 17.5f, 2);
		arr[5] = new Laptop("AMD Athlon", 21000, 1, 16, 2, 8, 19.5f, 3);
		arr[6] = new Monoblock("Intel Celeron", 10000, 2, 4, 1, 2);
		arr[7] = new Jigsaw("Громила", 2200, 1, 1700, 90);
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Circular_saw) {
				sum1 +=	 arr[i].getCount()*arr[i].getQuantity();
				System.out.println("Пила " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Electro_tool) arr[i]).getPower_consumption() + " ватт и радиус режущего диска " + ((Circular_saw) arr[i]).getRadius() + " мм");
				if (max < ((Electro_tool) arr[i]).getPower_consumption()) {
					max = ((Electro_tool) arr[i]).getPower_consumption();
				}
			}
			else if (arr[i] instanceof Drill) {
				sum2 +=	 arr[i].getCount()*arr[i].getQuantity();
				System.out.println("Дрель " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Electro_tool) arr[i]).getPower_consumption() + " ватт и максимальный диаметр сверла " + ((Drill) arr[i]).getDiameter() + " мм");
				if (max < ((Electro_tool) arr[i]).getPower_consumption()) {
					max = ((Electro_tool) arr[i]).getPower_consumption();
				}
			}
			else if (arr[i] instanceof Jigsaw) {
				sum3 +=	 arr[i].getCount()* arr[i].getQuantity();
				System.out.println("Лобзик " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Electro_tool) arr[i]).getPower_consumption() + " ватт и максимальная толщина пропила " + ((Jigsaw) arr[i]).getThickness() + " мм");
				if (max < ((Electro_tool) arr[i]).getPower_consumption()) {
					max = ((Electro_tool) arr[i]).getPower_consumption();
				}
			}
			else if (arr[i] instanceof Laptop) {
				sum4 +=	 arr[i].getCount()* arr[i].getQuantity();
				System.out.println("Ноутбук " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Computer) arr[i]).getMemory() + " GB " + ((Computer) arr[i]).getHard_disk_space() + " TB " + ((Computer) arr[i]).getCPU_cores() + " CPU " + ((Laptop) arr[i]).getDiagonal() + " дюймов срок службы " + ((Laptop) arr[i]).getTime() + " год(а)");
				place1 += arr[i].getQuantity()*((Computer) arr[i]).getHard_disk_space(); 
			}
			else if (arr[i] instanceof Monoblock) {
				sum5 +=	 arr[i].getCount()* arr[i].getQuantity();
				System.out.println("Моноблок " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Computer) arr[i]).getMemory() + " GB " + ((Computer) arr[i]).getHard_disk_space() + " TB " + ((Computer) arr[i]).getCPU_cores() + " CPU " );
				place2 += arr[i].getQuantity()*((Computer) arr[i]).getHard_disk_space();
			}
		}
		int sum_all = sum1+sum2+sum3+sum4+sum5;
		int place_all = place1 + place2;
		System.out.println(sum_all + " рублей (стоимость всех товаров)");
		System.out.println(max + " ватт  (наибольшая мощность предмета)");
		System.out.println(place_all + " TB (сумма места на жестком диске для всех компьютеров)");
		System.out.println("Пилу можно вернуть через 21 день. Нужен паспорт и чек.");
		System.out.println("Дрель можно вернуть через 14 дней. Нужен чек.");
		System.out.println("Ноутбук можно вернуть через 14 дней. Нужен паспорт и чек.");
		
			
		}
		
	}
