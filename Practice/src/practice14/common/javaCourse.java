package practice14.common;

public class javaCourse implements Course{


	public String getCourseName() {
		return "【Eラーニング】Java";
	}


	public String[] getCourseUnit() {
		return new String[]{"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
	}

}
