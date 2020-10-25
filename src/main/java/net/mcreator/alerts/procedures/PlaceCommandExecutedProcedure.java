package net.mcreator.alerts.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.alerts.AlertsModElements;

import java.util.Map;
import java.util.HashMap;

@AlertsModElements.ModElement.Tag
public class PlaceCommandExecutedProcedure extends AlertsModElements.ModElement {
	public PlaceCommandExecutedProcedure(AlertsModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("cmdparams") == null) {
			System.err.println("Failed to load dependency cmdparams for procedure PlaceCommandExecuted!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure PlaceCommandExecuted!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure PlaceCommandExecuted!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure PlaceCommandExecuted!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PlaceCommandExecuted!");
			return;
		}
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
			world.getWorld().getServer().getCommandManager()
					.handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							(("execute as @p run me is at ") + "" + ((((new Object() {
								public String getText() {
									String param = (String) cmdparams.get("0");
									if (param != null) {
										return param;
									}
									return "";
								}
							}.getText())) + "" + (" ") + "" + ((new Object() {
								public String getText() {
									String param = (String) cmdparams.get("1");
									if (param != null) {
										return param;
									}
									return "";
								}
							}.getText())) + "" + (" ") + "" + ((new Object() {
								public String getText() {
									String param = (String) cmdparams.get("2");
									if (param != null) {
										return param;
									}
									return "";
								}
							}.getText())) + "" + (" ") + "" + ((new Object() {
								public String getText() {
									String param = (String) cmdparams.get("3");
									if (param != null) {
										return param;
									}
									return "";
								}
							}.getText())) + "" + (" ") + "" + ((new Object() {
								public String getText() {
									String param = (String) cmdparams.get("4");
									if (param != null) {
										return param;
									}
									return "";
								}
							}.getText())) + "" + (" ") + "" + ((new Object() {
								public String getText() {
									String param = (String) cmdparams.get("5");
									if (param != null) {
										return param;
									}
									return "";
								}
							}.getText())) + "" + (" ") + "" + ((new Object() {
								public String getText() {
									String param = (String) cmdparams.get("6");
									if (param != null) {
										return param;
									}
									return "";
								}
							}.getText())) + "" + (" ") + "" + ((new Object() {
								public String getText() {
									String param = (String) cmdparams.get("7");
									if (param != null) {
										return param;
									}
									return "";
								}
							}.getText()))))));
		}
	}
}
