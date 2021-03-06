package com.mxthd.dao;

import com.mxthd.bean.Goods;
import org.apache.ibatis.annotations.Param;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

public interface GoodsInfoMapper {
    public List<Goods> getAllGoods(Goods goods);
//    根据标题查商品
    public List<Goods> getGoodsByTitle(@Param("title") String title);
//    首页查询
    public List<Goods> getHome(@Param("t") Integer t,@Param("min") Integer min,@Param("max") Integer max);
//    根据ID查询
    public Goods getById(Integer id);
    //访问
    public void click(Integer id);
    //    增加一个商品
    public Integer addGoods(Goods goods);
    //    修改一个商品byid
    public Integer updateGoods(@Param("goods") Goods goods,@Param("editId") Integer editId);
    //    删除一个商品byid
    public int deleteGoods(Integer delId);
    public void updateBystock(@Param("id") Integer id,@Param("stock") Integer stock);
    //商品数量-1
    public void updateStock(Integer id);
}
