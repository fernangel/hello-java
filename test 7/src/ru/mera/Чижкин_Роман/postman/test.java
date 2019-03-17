package ru.mera.Чижкин_Роман.postman;

public class test {
	public static void main(String[] args) {
		int sum1 = 0,  sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, max = 0, place1 = 0, place2 = 0;
		AbstractItem [] arr = new AbstractItem[300];
		arr[0] = new Circular_saws("Дружба", 6000, 2, 2000, 100);
		arr[1] = new Drills("Грызун", 3400, 4, 1500, 5);
		arr[2] = new Jigsaws("Вепрь", 2500, 3, 2100, 100);
		arr[3] = new Circular_saws("Баньши", 8000, 1, 2700, 120);
		arr[4] = new Laptops("Intel Pentium", 15000, 5, 8, 1, 4, 17.5f, 2);
		arr[5] = new Laptops("AMD Athlon", 21000, 1, 16, 2, 8, 19.5f, 3);
		arr[6] = new Monoblocks("Intel Celeron", 10000, 2, 4, 1, 2);
		arr[7] = new Jigsaws("Громила", 2200, 1, 1700, 90);
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Circular_saws) {
				sum1 +=	 arr[i].getCount()*arr[i].getQuantity();
				System.out.println("Пила " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Electro_tools) arr[i]).getPower_consumption() + " ватт и радиус режущего диска " + ((Circular_saws) arr[i]).getRadius() + " мм");
				if (max < ((Electro_tools) arr[i]).getPower_consumption()) {
					max = ((Electro_tools) arr[i]).getPower_consumption();
				}
			}
			else if (arr[i] instanceof Drills) {
				sum2 +=	 arr[i].getCount()*arr[i].getQuantity();
				System.out.println("Дрель " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Electro_tools) arr[i]).getPower_consumption() + " ватт и максимальный диаметр сверла " + ((Drills) arr[i]).getDiameter() + " мм");
				if (max < ((Electro_tools) arr[i]).getPower_consumption()) {
					max = ((Electro_tools) arr[i]).getPower_consumption();
				}
			}
			else if (arr[i] instanceof Jigsaws) {
				sum3 +=	 arr[i].getCount()* arr[i].getQuantity();
				System.out.println("Лобзик " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Electro_tools) arr[i]).getPower_consumption() + " ватт и максимальная толщина пропила " + ((Jigsaws) arr[i]).getThickness() + " мм");
				if (max < ((Electro_tools) arr[i]).getPower_consumption()) {
					max = ((Electro_tools) arr[i]).getPower_consumption();
				}
			}
			else if (arr[i] instanceof Laptops) {
				sum4 +=	 arr[i].getCount()* arr[i].getQuantity();
				System.out.println("Ноутбук " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Computers) arr[i]).getMemory() + " GB " + ((Computers) arr[i]).getHard_disk_space() + " TB " + ((Computers) arr[i]).getCPU_cores() + " CPU " + ((Laptops) arr[i]).getDiagonal() + " дюймов срок службы " + ((Laptops) arr[i]).getTime() + " год(а)");
				place1 += arr[i].getQuantity()*((Computers) arr[i]).getHard_disk_space(); 
			}
			else if (arr[i] instanceof Monoblocks) {
				sum5 +=	 arr[i].getCount()* arr[i].getQuantity();
				System.out.println("Моноблок " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Computers) arr[i]).getMemory() + " GB " + ((Computers) arr[i]).getHard_disk_space() + " TB " + ((Computers) arr[i]).getCPU_cores() + " CPU " );
				place2 += arr[i].getQuantity()*((Computers) arr[i]).getHard_disk_space();
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
