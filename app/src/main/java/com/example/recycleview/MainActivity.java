package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // リストに表示するデータを準備
        String titles[] = { "革命のエチュード", "G線上のマリア", "シャコンヌ", "夜の女王のアリア","春の海"};
        String tags[] = {"ピアノ","バイオリン","チェロ","声楽","箏"};
        String descs[] = {"ピアノの詩人と呼ばれたショパンの代表的な...",
                "バッハの作品。バイオリンのG線のみで演奏できることから...",
                "バッハの作品。パルティータ第2番の終曲です。",
                "モーツアルト作品のオペラ「魔笛」のなかのアリアです。",
                "宮城道雄の作品です。曲の舞台は鞆の浦と言われています。"};

        // 配列の内容をListItemオブジェクトに詰め替え
        ArrayList<ListItem> data = new ArrayList<>();
        for (int i = 0; i< titles.length; i++) {
            ListItem item = new ListItem();
            item.setId((new Random()).nextLong());
            item.setTitle(titles[i]);
            item.setTag(tags[i]);
            item.setDesc(descs[i]);
            data.add(item);
        }

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);

        // 固定サイズの場合にパフォーマンスを向上
        rv.setHasFixedSize(true);
        // レイアウトマネージャーの準備＆設定
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(manager);
        // アダプターをRecycerManagerに設定
        RecyclerView.Adapter adapter = new MyListAdapter(data);
        rv.setAdapter(adapter);

    }
}
