package com.mycompany.model.product.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.mycompany.model.product.Product;

@TestInstance(Lifecycle.PER_CLASS)
public class ProductTest
{
	
	private String clazz = "clazz";
	private String color = "color";
	private Integer daysToManufacture = 11;
	private Date discontinuedDate = toDate("05/01/2018");
	private Boolean finishedGoodsFlag = false;
	private Double listPrice = 12.45;
	private Boolean makeFlag = false;
	private Date modifiedDate = toDate("06/01/2018");
	private String name = "name";
	private Integer productID = 12;
	private String productLine = "productLine";
	private Integer productModelID = 13;
	private String productNumber = "productNumber";
	private Integer productSubcategoryID = 14;
	private Integer reorderPoint = 15;
	private String rowguid = "rowguid";
	private Integer safetyStockLevel = 16;
	private Date sellEndDate = toDate("07/01/2018");
	private Date sellStartDate = toDate("08/01/2018");
	private String size = "size";
	private String sizeUnitMeasureCode = "sizeUnitMeasureCode";
	private Double standardCost = 12.46;
	private String style = "style";
	private Double weight = 12.47;
	private String weightUnitMeasureCode = "weightUnitMeasureCode";

	private Product product;
	
	@BeforeAll
	public void init() throws ParseException
	{
		product = new Product();
	}
	
	@Test
	public void when_setClazz_Then_Getter_ReturnsSameValue()
	{
		product.setClazz(clazz);
		assertEquals(clazz, product.getClazz());
	}
	
	@Test
	public void when_setColor_Then_Getter_ReturnsSameValue()
	{
		product.setColor(color);
		assertEquals(color, product.getColor());
	}
	
	@Test
	public void when_setDaysToManufacture_Then_Getter_ReturnsSameValue()
	{
		product.setDaysToManufacture(daysToManufacture);
		assertEquals(daysToManufacture, product.getDaysToManufacture());
	}
	
	@Test
	public void when_setDiscontinuedDate_Then_Getter_ReturnsSameValue()
	{
		product.setDiscontinuedDate(discontinuedDate);
		assertEquals(discontinuedDate, product.getDiscontinuedDate());
	}
	
	@Test
	public void when_setFinishedGoodsFlag_Then_Getter_ReturnsSameValue()
	{
		product.setFinishedGoodsFlag(finishedGoodsFlag);
		assertEquals(finishedGoodsFlag, product.getFinishedGoodsFlag());
	}
	
	@Test
	public void when_setListPrice_Then_Getter_ReturnsSameValue()
	{
		product.setListPrice(listPrice);
		assertEquals(listPrice, product.getListPrice());
	}
	
	@Test
	public void when_setMakeFlag_Then_Getter_ReturnsSameValue()
	{
		product.setMakeFlag(makeFlag);
		assertEquals(makeFlag, product.getMakeFlag());
	}
	
	@Test
	public void when_setModifiedDate_Then_Getter_ReturnsSameValue()
	{
		product.setModifiedDate(modifiedDate);
		assertEquals(modifiedDate, product.getModifiedDate());
	}
	
	@Test
	public void when_setName_Then_Getter_ReturnsSameValue()
	{
		product.setName(name);
		assertEquals(name, product.getName());
	}
	
	@Test
	public void when_setProductID_Then_Getter_ReturnsSameValue()
	{
		product.setProductID(productID);
		assertEquals(productID, product.getProductID());
	}
	
	@Test
	public void when_setProductLine_Then_Getter_ReturnsSameValue()
	{
		product.setProductLine(productLine);
		assertEquals(productLine, product.getProductLine());
	}
	
	@Test
	public void when_setProductModelID_Then_Getter_ReturnsSameValue()
	{
		product.setProductModelID(productModelID);
		assertEquals(productModelID, product.getProductModelID());
	}
	
	@Test
	public void when_setProductNumber_Then_Getter_ReturnsSameValue()
	{
		product.setProductNumber(productNumber);
		assertEquals(productNumber, product.getProductNumber());
	}
	
	@Test
	public void when_setProductSubcategoryID_Then_Getter_ReturnsSameValue()
	{
		product.setProductSubcategoryID(productSubcategoryID);
		assertEquals(productSubcategoryID, product.getProductSubcategoryID());
	}
	
	@Test
	public void when_setReorderPoint_Then_Getter_ReturnsSameValue()
	{
		product.setReorderPoint(reorderPoint);
		assertEquals(reorderPoint, product.getReorderPoint());
	}
	
	@Test
	public void when_setRowguid_Then_Getter_ReturnsSameValue()
	{
		product.setRowguid(rowguid);
		assertEquals(rowguid, product.getRowguid());
	}
	
	@Test
	public void when_setSafetyStockLevel_Then_Getter_ReturnsSameValue()
	{
		product.setSafetyStockLevel(safetyStockLevel);
		assertEquals(safetyStockLevel, product.getSafetyStockLevel());
	}
	
	@Test
	public void when_setSellEndDate_Then_Getter_ReturnsSameValue()
	{
		product.setSellEndDate(sellEndDate);
		assertEquals(sellEndDate, product.getSellEndDate());
	}
	
	@Test
	public void when_setSellStartDate_Then_Getter_ReturnsSameValue()
	{
		product.setSellStartDate(sellStartDate);
		assertEquals(sellStartDate, product.getSellStartDate());
	}
	
	@Test
	public void when_setSize_Then_Getter_ReturnsSameValue()
	{
		product.setSize(size);
		assertEquals(size, product.getSize());
	}
	
	@Test
	public void when_setSizeUnitMeasureCode_Then_Getter_ReturnsSameValue()
	{
		product.setSizeUnitMeasureCode(sizeUnitMeasureCode);
		assertEquals(sizeUnitMeasureCode, product.getSizeUnitMeasureCode());
	}
	
	@Test
	public void when_setStandardCost_Then_Getter_ReturnsSameValue()
	{
		product.setStandardCost(standardCost);
		assertEquals(standardCost, product.getStandardCost());
	}
	
	@Test
	public void when_setStyle_Then_Getter_ReturnsSameValue()
	{
		product.setStyle(style);
		assertEquals(style, product.getStyle());
	}
	
	@Test
	public void when_setWeight_Then_Getter_ReturnsSameValue()
	{
		product.setWeight(weight);
		assertEquals(weight, product.getWeight());
	}
	
	@Test
	public void when_setWeightUnitMeasureCode_Then_Getter_ReturnsSameValue()
	{
		product.setWeightUnitMeasureCode(weightUnitMeasureCode);
		assertEquals(weightUnitMeasureCode, product.getWeightUnitMeasureCode());
	}
	
	private Date toDate(String sDate)
	{
		try
		{
			return new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
		} catch (ParseException e)
		{
			throw new RuntimeException("Wrong date format", e);
		}
	}
	
}
