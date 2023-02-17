package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
* Created byhomefrankfurth on 2/10/23 in FTC-master Learn Java.
*
* Copyright (c) ©2023 Kirk Frankfurth
* Copyright (c) ©2023 Mentor of Team VECTOR (5233) Kirk
* Resource: https:/gitlab.com/robotics/ftc_app
* Contact: kfrankfurth@chapelgateacademy.org, vector5233@gmail.com
*/
@TeleOp
public class SpecialMethodConstructors extends OpMode {



    @Override
    public void init()
    {

    }

    @Override
    public void loop()
    {

    }
    public class Point {
        int x;
        int y;


    public Point (int x_in, int y_in){
        x = x_in;
        y = y_in;

        }
        @Override
        public String toString(){
        return "Point " +x + "" + y;
        }
    }

}
