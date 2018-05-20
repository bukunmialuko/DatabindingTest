package ng.com.obkm.databinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ng.com.obkm.databinding.databinding.ActivityMainBinding;
import ng.com.obkm.databinding.models.Product;
import ng.com.obkm.databinding.util.Products;

public class MainActivity extends AppCompatActivity implements IMainActivity{


    //data binding
    ActivityMainBinding mBinding;
    private Product mProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Products products = new Products();
        mProduct = products.PRODUCTS[0];

        mBinding.setProduct(mProduct);
        mBinding.setQuantity(1);
        mBinding.setIMainActivity((IMainActivity)this);
        mBinding.setTestUrl("https://i.imgur.com/KJCsGGp.jpg");

    }

    @Override
    public void inflateQuantityDialog() {
        ChooseQuantityDialog dialog = new ChooseQuantityDialog();
        dialog.show(getSupportFragmentManager(), getString(R.string.dialog_choose_quantity));
    }

    @Override
    public void setQuantity(int quantity) {
        mBinding.setQuantity(quantity);
    }


}
