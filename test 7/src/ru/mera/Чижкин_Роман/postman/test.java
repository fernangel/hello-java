package ru.mera.Чижкин_Роман.postman;

public class test {
	public static void main(String[] args) {
		boolean k = true; boolean n = true; boolean j = true;
		int sum1 = 0; int sum2 = 0; int sum3 = 0; int sum4 = 0; int sum5 = 0;
		int max = 0;
		int place1 = 0; int place2 = 0;
		AbstractItem [] arr = new AbstractItem[300];
		arr[0] = new Circular_saws("Дружба", 6000, 2, 2000, 100);
		arr[1] = new Drills("Грызун", 3400, 4, 1500, 5);
		arr[2] = new Jigsaws("Вепрь", 2500, 3, 2100, 100);
		arr[3] = new Circular_saws("Средство от пиндосов", 8000, 1, 2700, 120);
		arr[4] = new Laptops("Intel Pentium", 15000, 5, 8, 1, 4, 17.5f, 2);
		arr[5] = new Laptops("AMD Athlon", 21000, 1, 16, 2, 8, 19.5f, 3);
		arr[6] = new Monoblocks("Intel Celeron", 10000, 2, 4, 1, 2);
		arr[7] = new Jigsaws("Громила", 2200, 1, 1700, 90);
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Circular_saws) {
				sum1 +=	((Circular_saws) arr[i]).getCount()*((Circular_saws) arr[i]).getQuantity();
				System.out.println("Пила " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Circular_saws) arr[i]).getPower_consumption() + " ватт и радиус режущего диска " + ((Circular_saws) arr[i]).getRadius() + " мм");
				if (max < ((Circular_saws) arr[i]).getPower_consumption()) {
					max = ((Circular_saws) arr[i]).getPower_consumption();
				}
			}
			else if (arr[i] instanceof Drills) {
				sum2 +=	((Drills) arr[i]).getCount()*((Drills) arr[i]).getQuantity();
				System.out.println("Дрель " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Drills) arr[i]).getPower_consumption() + " ватт и максимальный диаметр сверла " + ((Drills) arr[i]).getDiameter() + " мм");
				if (max < ((Drills) arr[i]).getPower_consumption()) {
					max = ((Drills) arr[i]).getPower_consumption();
				}
			}
			else if (arr[i] instanceof Jigsaws) {
				sum3 +=	((Jigsaws) arr[i]).getCount()*((Jigsaws) arr[i]).getQuantity();
				System.out.println("Лобзик " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Jigsaws) arr[i]).getPower_consumption() + " ватт и максимальная толщина пропила " + ((Jigsaws) arr[i]).getThickness() + " мм");
				if (max < ((Jigsaws) arr[i]).getPower_consumption()) {
					max = ((Jigsaws) arr[i]).getPower_consumption();
				}
			}
			else if (arr[i] instanceof Laptops) {
				sum4 +=	((Laptops) arr[i]).getCount()*((Laptops) arr[i]).getQuantity();
				System.out.println("Ноутбук " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Laptops) arr[i]).getMemory() + " GB " + ((Laptops) arr[i]).getHard_disk_space() + " TB " + ((Laptops) arr[i]).getCPU_cores() + " CPU " + ((Laptops) arr[i]).getDiagonal() + " дюймов срок службы " + ((Laptops) arr[i]).getTime() + " год(а)");
				place1 += ((Laptops) arr[i]).getQuantity()*((Laptops) arr[i]).getHard_disk_space(); 
			}
			else if (arr[i] instanceof Monoblocks) {
				sum5 +=	((Monoblocks) arr[i]).getCount()*((Monoblocks) arr[i]).getQuantity();
				System.out.println("Моноблок " + arr[i].getName() + " " +arr[i].getCount() + " руб " +arr[i].getQuantity() + " шт " + ((Monoblocks) arr[i]).getMemory() + " GB " + ((Monoblocks) arr[i]).getHard_disk_space() + " TB " + ((Monoblocks) arr[i]).getCPU_cores() + " CPU " );
				place2 += ((Monoblocks) arr[i]).getQuantity()*((Monoblocks) arr[i]).getHard_disk_space();
			}
		}
		int sum_all = sum1+sum2+sum3+sum4+sum5;
		int place_all = place1 + place2;
		System.out.println(sum_all + " рублей (стоимость всех товаров)");
		System.out.println(max + " ватт  (наибольшая мощность предмета)");
		System.out.println(place_all + " TB (сумма места на жестком диске для всех компьютеров)");
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Circular_saws && k == true) {
				System.out.println("Пилу можно вернуть через " + ((Circular_saws) arr[i]).getDaysForReturn() + " день после покупки. Для этого нужны "	+ ((Circular_saws) arr[i]).getRequiredDocuments());
				k = false;
				}
			else if (arr[i] instanceof Drills && n == true ) {
				System.out.println("Дрель можно вернуть через " + ((Drills) arr[i]).getDaysForReturn() + " дней после покупки. Для этого нужен "	+ ((Drills) arr[i]).getRequiredDocuments());
				n = false;
				}
			else if (arr[i] instanceof Laptops && j == true) {
				System.out.println("Ноутбук можно вернуть через " + ((Laptops) arr[i]).getDaysForReturn() + " дней после покупки. Для этого нужны "	+ ((Laptops) arr[i]).getRequiredDocuments());
				j = false;
				}
		}
		
	}
}
