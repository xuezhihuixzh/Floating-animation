package detongs.hbqianze.him.amimaio.viwe;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import detongs.hbqianze.him.amimaio.R;

/**
 * @author 薛志辉
 * @Date: 2019/7/31
 * @Describe 标定管理
 */
public class EpetTypeSwitchView extends RelativeLayout {
    public EpetTypeSwitchView(Context context) {
        super(context);
        init(context);
    }



    public EpetTypeSwitchView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);

    }

    public EpetTypeSwitchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }
    private void init(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_epettype_switch, this,true);
        MyImageView viewById = (MyImageView) inflate.findViewById(R.id.epet_prompt);
        MyImageView imageViewDog = (MyImageView) inflate.findViewById(R.id.epet_type);
        LinearLayout switchlayout = (LinearLayout) inflate.findViewById(R.id.layout);
        //设置动画背景
        //其中R.drawable.animation_list就是上一步准备的动画描述文件的资源名
        imageViewDog.setBackgroundResource(R.drawable.anim_tab_home_switch);
        //获得动画对象
        //不一定是设置背景，也可以作为src图片设置
        AnimationDrawable animaition = (AnimationDrawable) imageViewDog.getBackground();
        //是否重复播放
        animaition.setOneShot(false);
        animaition.start();
        //点击眼睛后的点击事件
        switchlayout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
