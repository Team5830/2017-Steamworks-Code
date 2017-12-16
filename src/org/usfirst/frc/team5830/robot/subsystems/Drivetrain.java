package org.usfirst.frc.team5830.robot.subsystems;

import org.usfirst.frc.team5830.robot.RobotMap;
import org.usfirst.frc.team5830.robot.commands.Drive;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

    public void TankDrive(double LeftSpeed, double RightSpeed) {
        RobotMap.drivetrainLeft1.set(LeftSpeed);
        RobotMap.drivetrainLeft2.set(LeftSpeed);
        RobotMap.drivetrainLeft3.set(LeftSpeed);
        RobotMap.drivetrainRight1.set(-RightSpeed);
        RobotMap.drivetrainRight2.set(-RightSpeed);
        RobotMap.drivetrainRight3.set(-RightSpeed);
    }
    
    public void arcadeDrive(double Y, double X) {
        double Left = Y + X;
        double Right = Y - X;

        TankDrive(Left, Right);
    }
    
    public static void DriveForward() {
    RobotMap.drivetrainLeft1.set(1);
    RobotMap.drivetrainLeft2.set(1);
    RobotMap.drivetrainLeft3.set(1);
    RobotMap.drivetrainRight1.set(-1);
    RobotMap.drivetrainRight2.set(-1);
    RobotMap.drivetrainRight3.set(-1);
    }
    
    public static void DriveStop() {
    RobotMap.drivetrainLeft1.set(1);
    RobotMap.drivetrainLeft2.set(1);
    RobotMap.drivetrainLeft3.set(1);
    RobotMap.drivetrainRight1.set(-1);
    RobotMap.drivetrainRight2.set(-1);
    RobotMap.drivetrainRight3.set(-1);
    }

    public void initDefaultCommand() {
    	setDefaultCommand(new Drive());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

}

