package club.hnxxzyjsxy.redsky;

import android.view.MotionEvent;

public class Touch {
    public static boolean Touch(MotionEvent event) {
        int x = (int) event.getX(event.getActionIndex());
        if (environmentObject.isBack) {
        } else {
            switch (environmentObject.page) {
                case 0:
                    switch (event.getAction() & event.ACTION_MASK) {
                        case MotionEvent.ACTION_DOWN:
                            if (event.getY() <= environmentObject.display_h / 2) {
                                //environmentObject.page = 11;
                                //GoodsUpdate.schedule(new GoodRunTask(), 0, 500);
                                //animation.schedule(new Animation(), 0, 100);

                    /*            new Thread(new Runnable() {
                            } else {
                                    @Override
                                    public void run() {

                                        try {
                                            environmentObject.socket = new Socket("144.202.7.185", 7777);
                                            Log.e("AAA", "SSSSSSSSSSSSS");
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }

                                        send.start();
                                        // request.sta rt();
                                        //environmentObject.page = 22;

                                    }
                                }).start();*/
                                environmentObject.page = 22;
                                //GoodsUpdate.schedule(new GoodRunTask(), 0, 100);
                                //animation.schedule(new Animation(), 0, 100);
                                //player.add(new GoodsEntity.player(environmentObject.display_w / 2, environmentObject.display_h * environmentObject.load));
                            }
                            break;
                    }
                    break;
                case 11:
                    switch (event.getAction() & MotionEvent.ACTION_MASK) {
                        case MotionEvent.ACTION_DOWN:
                            if (x < environmentObject.display_w / 2) {
                                object.MoveDirections.add(0);
                            } else {
                                object.MoveDirections.add(1);
                            }
                            break;
                        case MotionEvent.ACTION_POINTER_DOWN:
                            if (x < environmentObject.display_w / 2) {
                                object.MoveDirections.add(0);
                            } else {
                                object.MoveDirections.add(1);
                            }
                            break;
                        case MotionEvent.ACTION_UP:
                            object.MoveDirections.clear();
                            break;
                        case MotionEvent.ACTION_POINTER_UP:
                            break;
                    }
                case 22:
                    switch (event.getAction() & MotionEvent.ACTION_MASK) {
                        case MotionEvent.ACTION_DOWN:
                            if (x < environmentObject.display_w / 2) {
                                object.MoveDirections.add(0);
                            } else {
                                object.MoveDirections.add(1);
                            }
                            break;
                        case MotionEvent.ACTION_POINTER_DOWN:
                            if (x < environmentObject.display_w / 2) {
                                object.MoveDirections.add(0);
                            } else {
                                object.MoveDirections.add(1);
                            }
                            break;
                        case MotionEvent.ACTION_UP:
                            object.MoveDirections.clear();
                            break;
                        case MotionEvent.ACTION_POINTER_UP:
                            break;
                    }
            }
        }
        return true;
    }
}