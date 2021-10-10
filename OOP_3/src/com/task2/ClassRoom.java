package com.task2;

public class ClassRoom {
    Pupil[] pupils;

    ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4){
      pupils = new Pupil[4];
      pupils[0] = pupil1;
      pupils[1] = pupil2;
      pupils[2] = pupil3;
      pupils[3] = pupil4;
    }
}
