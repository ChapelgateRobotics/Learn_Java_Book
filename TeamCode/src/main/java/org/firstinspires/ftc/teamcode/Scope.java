package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
* Created byhomefrankfurth on 2/8/23 in FTC-master Learn Java.
*
* Copyright (c) ©2023 Kirk Frankfurth
* Copyright (c) ©2023 Mentor of Team VECTOR (5233) Kirk
* Resource: https:/gitlab.com/robotics/ftc_app
* Contact: kfrankfurth@chapelgateacademy.org, vector5233@gmail.com
*/
@TeleOp
public class Scope extends OpMode


{
@Override
    public void init(){

}
@Override
    public void loop(){
        int x = 5;
        //x is visible here
        {
            int y = 4;
            // x and y are visible here
        }
        //only x is visible here
    }
}
