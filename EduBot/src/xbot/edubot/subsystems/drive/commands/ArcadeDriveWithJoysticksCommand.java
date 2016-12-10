package xbot.edubot.subsystems.drive.commands;

import com.google.inject.Inject;

import xbot.common.command.BaseCommand;
import xbot.edubot.operator_interface.OperatorInterface;
import xbot.edubot.subsystems.drive.DriveSubsystem;

public class ArcadeDriveWithJoysticksCommand extends BaseCommand {
	

	DriveSubsystem drive;
	OperatorInterface operate;
	

	@Inject
	public ArcadeDriveWithJoysticksCommand(DriveSubsystem driveSubsystem, OperatorInterface oi) {
		// TODO Auto-generated constructor stub
		drive = driveSubsystem;
		operate = oi;
		
		
		
	}
	
	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		double y = operate.leftJoystick.getVector().y;
		double x = operate.leftJoystick.getVector().x;
	
		drive.arcadeDrive(y, x);
	}
	

}
