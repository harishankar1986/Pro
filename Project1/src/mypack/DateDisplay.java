package mypack;
import mypack.MyDate;
import mypack.DateImpl;

class DateDisplay {
	public static void main(String args[]) {
		MyDate obj = new DateImpl();
		obj.showDate();
	}
}
