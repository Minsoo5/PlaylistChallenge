package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int ans = 0;
//                                                   start                            goal
//        String[] playlist = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia"};

        int upCounter = numOfUp(startIndex, selection);
        int downCounter = numOfDown(startIndex, selection);

        if (upCounter < downCounter) {
            return upCounter;
        }

        return downCounter;
    }


    //create two function where one just goes forward and the other goes back wards
    //return the lower number

    public int numOfDown(Integer startIndex, String selection) {
        //going past last element will start the list again
        int downCounter = 0;
        String currentSong = "";

        if (!currentSong.equals(selection)) {

            for (int i = startIndex; i <= playList.length - 1; i++) {
                currentSong = playList[i];
                downCounter++;

                if (i == playList.length - 1 && currentSong != selection) {
                    for (int j = 0; j < playList.length; j++) {
                        currentSong = playList[j];
                        downCounter++;
                    }
                }

            }


        }

        return downCounter;
    }


    public int numOfUp(Integer startIndex, String selection) {
        //going behind the first element will go to the end
        int upCounter = 0;
        String currentSong = "";

        if (!currentSong.equals(selection)) {

            for (int i = startIndex; i >= 0; i--) {
                currentSong = playList[i];
                upCounter++;

                if (i == 0 && currentSong != selection) {
                    for (int j = playList.length; j < 0; j--) {
                        currentSong = playList[j];
                        upCounter++;
                    }
                }

            }


        }

        return upCounter;
    }




}
