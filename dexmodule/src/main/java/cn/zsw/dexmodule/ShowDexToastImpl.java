package cn.zsw.dexmodule;

import android.content.Context;
import android.widget.Toast;

/**
 * @Author: zsw
 * @CreateDate: 2020/3/19 13:59
 * @Description:
 */
public class ShowDexToastImpl implements IShowToast {
    @Override
    public int showDexToast(Context context) {
        Toast.makeText(context,"---这是来自Dex的Toast---",Toast.LENGTH_LONG).show();
//        Toast.makeText(context,"这是来自Dex的Toast>>",Toast.LENGTH_LONG).show();
        return 100;
    }
}
