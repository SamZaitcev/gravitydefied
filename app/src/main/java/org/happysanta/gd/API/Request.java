package org.happysanta.gd.API;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;

import static org.happysanta.gd.Helpers.getAppVersion;
import static org.happysanta.gd.Helpers.logDebug;

public class Request {

	private List<String> params; // Изменил тип на String, так как NameValuePair был удален
	private ResponseHandler handler;
	private AsyncRequestTask task;
	private String apiURL;

	public Request(String method, List<String> params, ResponseHandler handler, boolean useDebugURL) {
		construct(method, params, handler, useDebugURL ? API.DEBUG_URL : API.URL);
	}

	public Request(String method, List<String> params, ResponseHandler handler) {
		construct(method, params, handler, API.URL);
	}

	private void construct(String method, List<String> params, ResponseHandler handler, String apiURL) {
		this.apiURL = apiURL;

		// TODO: Добавьте вашу новую логику для параметров здесь

		this.params = params;
		this.handler = handler;

		go();
	}

	private void go() {
		task = new AsyncRequestTask();
		task.execute(apiURL);
	}

	public void cancel() {
		if (task != null) {
			task.cancel(true);
			task = null;
		}
	}

	private void onDone(String result) {
		Response response;
		logDebug("API.Request.onDone()");

		// TODO: Реализуйте вашу новую логику обработки ответа здесь

		handler.onError(new APIException("Заглушка: реализуйте вашу новую логику обработки ответа"));
	}

	protected class AsyncRequestTask extends AsyncTask<String, Void, String> {

		@Override
		protected String doInBackground(String... objects) {
			String url = objects[0];

			// TODO: Реализуйте вашу новую логику запроса здесь

			return "Заглушка: реализуйте вашу новую логику запроса";
		}

		@Override
		public void onPostExecute(String result) {
			onDone(result);
		}
	}
}
