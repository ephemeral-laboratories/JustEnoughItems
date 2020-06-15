package mezz.jei.util;

import net.minecraft.client.gui.FontRenderer;

import java.text.NumberFormat;

public final class StringUtil {
	private static final NumberFormat numberFormat = NumberFormat.getNumberInstance();
	private static final NumberFormat integerFormat = NumberFormat.getIntegerInstance();

	private StringUtil() {

	}

	public static String truncateStringToWidth(String string, int width, FontRenderer fontRenderer) {
		return fontRenderer.trimStringToWidth(string, width - fontRenderer.getStringWidth("...")) + "...";
	}

	public static String formatInteger(int value) {
		return integerFormat.format(value);
	}

	public static String formatFloat(float value) {
		return numberFormat.format(value);
	}
}
