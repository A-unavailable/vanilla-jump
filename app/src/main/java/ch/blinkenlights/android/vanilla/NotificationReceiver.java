import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NotificationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if ("ACTION_JUMP_FORWARD".equals(intent.getAction())) {
            // Вызовите метод для перепрыгивания на 10 секунд
            PlaybackService playbackService = new PlaybackService();
            playbackService.jumpForward();
        }
    }
}

