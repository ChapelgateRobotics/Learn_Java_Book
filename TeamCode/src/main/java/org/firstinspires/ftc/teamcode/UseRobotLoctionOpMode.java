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
public    class UseRobotLoctionOpMode extends OpMode {
    RobotLocation robotLocation = new RobotLocation(0);


    @Override
    public void init()
    {
        robotLocation.setAngel(0);

    }

    @Override
    public void loop()
    {
        if(gamepad1.a){
            robotLocation.turn(0.1);
        }
        else if (gamepad1.b){
            robotLocation.turn(-0.1);
        }
        telemetry.addData("Location", robotLocation);
        telemetry.addData("Heading", robotLocation.getHeading());
    }
}
