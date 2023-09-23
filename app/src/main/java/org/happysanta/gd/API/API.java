package org.happysanta.gd.API;

import java.io.FileOutputStream;

public class API {

	public static final String URL = "http://gdtr.net/api.php";
	public static final String DEBUG_URL = "http://dev.gdtr.net/api.php";
	public static final String MRG_URL = "http://gdtr.net/mrg/%d.mrg";
	public static final int VERSION = 2;

	public static Request getLevels(int offset, int limit, LevelsSortType sort, ResponseHandler handler)
			throws Exception {
		// TODO: Implement this method with new logic or remove if not needed
		return null;
	}

	public static Request getNotifications(boolean installedFromAPK, ResponseHandler handler) {
		// TODO: Implement this method with new logic or remove if not needed
		return null;
	}

	public static Request sendStats(String statsJSON, String installationID, int useCheats, ResponseHandler handler) {
		// TODO: Implement this method with new logic or remove if not needed
		return null;
	}

	public static Request sendKeyboardLogs(String log, ResponseHandler handler) {
		// TODO: Implement this method with new logic or remove if not needed
		return null;
	}

	public static DownloadFile downloadMrg(long id, FileOutputStream output, DownloadHandler handler) {
		// TODO: Implement this method with new logic or remove if not needed
		return null;
	}

	public static String getMrgURL(long id) {
		return String.format(MRG_URL, id);
	}

	public static enum LevelsSortType {
		POPULAR("popular"), TRACKS("tracks"), RECENT("recent"), OLDEST("oldest");

		private final String text;

		private LevelsSortType(final String text) {
			this.text = text;
		}

		@Override
		public String toString() {
			return text;
		}
	}

	public static LevelsSortType getSortTypeById(int id) {
		switch (id) {
			case 0:
				return LevelsSortType.POPULAR;
			case 1:
				return LevelsSortType.RECENT;
			case 2:
				return LevelsSortType.OLDEST;
			case 3:
				return LevelsSortType.TRACKS;
		}
		return null;
	}

	public static int getIdBySortType(LevelsSortType type) {
		switch (type) {
			case POPULAR:
				return 0;
			case RECENT:
				return 1;
			case OLDEST:
				return 2;
			case TRACKS:
				return 3;
		}
		return 0;
	}
}
