import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        Album2 a2= new Album2();
        a2.setTitle("Spring");
        a2.setReleaseYear(2024);
        a2.addTracks("AAA");
        a2.addTracks("BBB");
        a2.addTracks("CCC");

        List<String> temp = a2.getTracks();
        System.out.println(temp.size()); //List의 length는 size()로 확인 가능
        //System.out.println((a2.getTracks().size());// 위 두줄의 간략 버전 즉,  같은 의미이다!!!

        System.out.println(temp); //-> toString 자동으로 동작(list 자체에 toString이 있는데 오버라이딩 되었음)
        //System.out.println(a2.getTracks()); 같은 의미이다!!

        a2.removeTracks("BBB");
        System.out.println(a2.getTracks().size());
        System.out.println(a2.getTracks());

        a2.removeTracks("FFF");



    }
}
//배열 대신 컬렉션 중에 하나인 ArrayList를 사용하는 예제
class Album2{
    private String title;
    private int releaseYear;
    private List<String> tracks; // 원래 문자열의 배열이였던 것을 List로 변경 //<데이터 타입>

    public Album2() {
        this.tracks = new ArrayList<>(); //List 클래스의 생성자는 ArrayList<>()사용
    }

    public Album2(String title, int releaseYear, List<String> tracks) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "앨범제목 :"+ this.title+" 발매연도 :" + this.releaseYear;
    }
    public void addTracks(String track){
        tracks.add(track); //개수 , 위치  신경 x - > 자동으로 알아서 넣어줌
        //매개변수의 데이터 타입이 문자열이여야함
    }
    public void removeTracks(String track){
       if(tracks.remove(track)){//해당
           System.out.println("곡이 삭제되었습니다: "+ track); //==>해당 곡이 존재하면 삭제 후 true
       }else {
           System.out.println("곡을 찾을 수 없습니다: "+track); //==>해당 곡이 존재하지 않으면 false리턴
       }
    }

}
