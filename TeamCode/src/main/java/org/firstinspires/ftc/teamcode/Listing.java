package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


/**
* Created byhomefrankfurth on 3/13/22 in FTC-Freight Frenzy.
*
* Copyright (c) ©2022 Kirk Frankfurth
* Copyright (c) ©2022 Mentor of Team VECTOR (5233) Kirk
* Resource: https:/gitlab.com/robotics/ftc_app
* Contact: kfrankfurth@chapelgateacademy.org, vector5233@gmail.com
*/
@TeleOp
public class Listing extends OpMode
{
    boolean initDone;
    @Override

    public void init(){
        telemetry.addData("init done", initDone);
        initDone = true;

    }
    @Override
    public  void loop(){
    telemetry.addData("init done", initDone);
    initDone = true;
    }
}
