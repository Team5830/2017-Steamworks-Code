
package org.usfirst.frc.team5830.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team5830.robot.subsystems.Climber;
import org.usfirst.frc.team5830.robot.subsystems.Drivetrain;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	//public final Timer myTimer = new Timer();

	public static final Climber CLIMBER = new Climber();
	public static final Drivetrain DRIVETRAIN = new Drivetrain();
	public static OI oi;

	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();
//		chooser.addDefault("Default Auto", new ExampleCommand());
		// chooser.addObject("My Auto", new MyAutoCommand());
//		SmartDashboard.putData("Auto mode", chooser);
		CameraServer.getInstance().startAutomaticCapture("Gear Camera",0);
		CameraServer.getInstance().startAutomaticCapture("Climber Camera",1);
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		   // If is has been less than 2 seconds since autonomous started, drive forwards
	    //if(myTimer.get() < 6.0){
	        RobotMap.drivetrainLeft1.set(0.5);
	        RobotMap.drivetrainLeft2.set(0.5);
	        RobotMap.drivetrainLeft3.set(0.5);
	        RobotMap.drivetrainRight1.set(-0.5);
	        RobotMap.drivetrainRight2.set(-0.5);
	        RobotMap.drivetrainRight3.set(-0.5);
	    //}

	    // If more than 2 seconds have elapsed, stop driving and turn off the timer
	   // else {
	        Timer.delay(5);
	        RobotMap.drivetrainLeft1.set(0);
	        RobotMap.drivetrainLeft2.set(0);
	        RobotMap.drivetrainLeft3.set(0);
	        RobotMap.drivetrainRight1.set(0);
	        RobotMap.drivetrainRight2.set(0);
	        RobotMap.drivetrainRight3.set(0);
	        //myTimer.stop();
	   	//}
		//autonomousCommand = chooser.getSelected();
		//myTimer.reset();
		//myTimer.start();

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
	 
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
		
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
