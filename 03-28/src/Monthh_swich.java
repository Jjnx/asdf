public class Monthh_swich {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season=null;
		switch(month) {
		case 1 : season = "겨울"; break;
		case 2 : season = "겨울"; break;
		case 3 : season = "봄"; break;
		case 4 : season = "봄"; break;
		case 5 : season = "봄"; break;
		case 6 : season = "여름"; break;
		case 7 : season = "여름"; break;
		case 8 : season = "여름"; break;
		case 9 : season = "가을"; break;
		case 10 : season = "가을"; break;
		case 11 : season = "가을"; break;
		case 12 : season = "겨울"; break;
		default: season = "잘못된 값";
		}
		System.out.println(month+"월은 "+ season +"입니다.");

	}
}

