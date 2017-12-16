package org.usfirst.frc.team5830.robot.subsystems;

import org.usfirst.frc.team5830.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Climber extends Subsystem {

	public static Talon climber1 = RobotMap.climberMotor1;
	public static Talon climber2 = RobotMap.climberMotor2;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public static void Climb() {
    climber1.set(1); //1 motor REVERSED or gearbox damage
    climber2.set(-1);
	}
    
    public static void ClimbStop() {
    	climber1.set(0);
    	climber2.set(0);
    }

}

