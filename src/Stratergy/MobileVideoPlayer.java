package Stratergy;

public class MobileVideoPlayer extends VideoPlayer {
        public MobileVideoPlayer(Device device,Resolution resolution) {
            this.currentDevice=device;
            this.currentResolution=resolution;
        }
        @Override
        void display() {
            this.getDevice();
            this.getResolution();
        }
    }


