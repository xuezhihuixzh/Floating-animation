package detongs.hbqianze.him.amimaio.viwe;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * @author 薛志辉
 * @Date: 2019/7/31
 * @Describe 标定管理
 */
@SuppressLint("AppCompatCustomView")
public class MyImageView extends ImageView {


    public MyImageView(Context paramContext)
    {
        super(paramContext);
        initViews();
    }

    public MyImageView(Context paramContext, AttributeSet paramAttributeSet)
    {
        super(paramContext, paramAttributeSet);
        initViews();
    }

    public MyImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
        super(paramContext, paramAttributeSet, paramInt);
        initViews();
    }

    @TargetApi(21)
    public MyImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
    {
        super(paramContext, paramAttributeSet, paramInt1, paramInt2);
        initViews();
    }

    protected void initViews() {}
}