package Stratergy;

public class Main {
    public static void main(String[] args) {
        Resolution res=new res1080p();
        Device mob=new Mobile();
        VideoPlayer player=new MobileVideoPlayer(mob,res);
        player.display();

        Resolution tvres=new res720p();
        Device tv=new TV();
        VideoPlayer tvplayer=new TVVideoPlayer(tv,tvres);
        tvplayer.display();

    }
}
