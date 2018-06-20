package br.com.stant.libraries.stantuiandroid.componentsactivities.basictoolbarview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.stant.libraries.stantuiandroid.R;
import br.com.stant.libraries.stantuiandroid.databinding.BasicToolbarViewTestActBinding;
import br.com.stant.libraries.uilibrary.components.basictoolbarview.BasicToolbarView;

public class BasicToolbarViewActivity extends AppCompatActivity {

    private BasicToolbarViewTestActBinding mBasicToolbarViewTestActBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBasicToolbarViewTestActBinding = DataBindingUtil.setContentView(this, R.layout.basic_toolbar_view_test_act);

        mBasicToolbarViewTestActBinding.setTitle(getString(R.string.basic_toolbar_view_text_title));
        mBasicToolbarViewTestActBinding.setSubtitle(getString(R.string.basic_toolbar_view_text_subtitle));

    }
}
