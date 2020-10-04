package com.example.activity.sichuancuisine;

import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
 private FragmentTransaction beginTransaction;
    //设置文字
    private String[] settingText = {"" +
            "1.鱼头去鳞，鱼鳃清洗干净，斩成两片码入盆内放料酒、姜片腌渍30分钟;\n" +
            "2.辣椒切段、葱切长段、姜蒜切末、香菜切大段;\n" +
            "3.热锅凉油放辣椒段、葱姜末煸炒出香；\n" +
            "4.放入香水鱼调料、葱段翻炒;\n" +
            "5.锅内加水，放如鱼头片，水开煮10分钟即可。" ,

            "1.梅干菜浸泡一夜，清洗几次去掉泥沙，葱切段、姜切片备用;\n" +
            "2.五花肉清洗干净后，加入葱姜、桂皮、八角、几滴白酒，放入砂锅中，大火烧开转小火;\n" +
            "3.炖煮20分钟，拿出后趁热抹上少许的老抽;\n" +
            "4.锅里抹薄薄一层油，将肉皮向下放入锅中，小火慢慢煎烤;\n" +
            "5.直到肉皮颜色金黄，油脂溢出，将肉块四面都煎制一下至上色;\n"+
            "6.倒入刚才煮肉的肉汁，加入生抽、少许盐、酱油和适量冰糖调味，小火焖煮15分钟;\n"+
            "7.煎好的肉稍凉后切成片,肉皮向下，均匀排在饭碗中,上面铺上梅菜,放入高压锅中蒸制;\n"+
            "8.20分钟后放气开锅，将蒸出的肥油滤出,重复一遍,找一菜碟，倒扣即可。\n"
    };
    //设置图标
    private int[] settingicons = {R.drawable.fish,R.drawable.meant};
    private String[] foodNames = {"麻辣鱼头","梅菜扣肉"};
    //获取图标数组的方法
    public int[] getIcons() {
        return settingicons;
    }
    //获取设置菜品名称的方法
    public String[] getFoodNames() {
        return foodNames;
    }
    //获取设置文字的方法
    public String[] getSettingText() {
        return settingText;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContentFragment contentFragment = new ContentFragment();
        MenuFragment menuFragment = new MenuFragment();
        beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.foodcontent,contentFragment);
        beginTransaction.replace(R.id.menu,menuFragment);
        beginTransaction.commit();


    }
}