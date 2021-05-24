import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

	public static List<ProductInfoTEST> readFile(File file) throws IOException {
		FileReader filereader = null;
		List<ProductInfoTEST> productinfoList = new ArrayList<ProductInfoTEST>();

		try {
			filereader = new FileReader(file);
			productinfoList = readReader(filereader);
		} finally {
			if (filereader != null) {
				filereader.close();
			}
		}
		return productinfoList;
	}
	
	private static List<ProductInfoTEST> readReader(FileReader filereader) throws IOException {
		try {
			BufferedReader in = new BufferedReader(filereader);
			String line;
			
			List<ProductInfoTEST> productinfoList = new ArrayList<ProductInfoTEST>();
			
			while((line = in.readLine()) != null) {
				String[] writeStr = line.split("\t");
				
				if(writeStr.length != 6) {	//6으로 설정했을때 오류나지 않는지 체크해야함
					continue;
				}
				
				ProductInfoTEST productinfo = new ProductInfoTEST();
				
				productinfo.setProduct_code(Integer.parseInt(writeStr[0]));
				productinfo.setProduct_name(writeStr[1]);
				productinfo.setUnit_price(Double.parseDouble(writeStr[2]));
				productinfo.setClient(writeStr[3]);
				productinfo.setNotes(writeStr[4]);
				
				productinfoList.add(productinfo);
			}
			return productinfoList;
		} finally {
			filereader.close();
		}
		
	}

	/**
	 * 
	 * @param dir = directory for save
	 * @param name = file name
	 * @param productinfoList = list for product info
	 * @throws IOException
	 */
	public static void writeFile(String dir, String name, List<ProductInfoTEST> productinfoList) throws IOException {
		OutputStream out = null;
		
		try {
			File dirent = new File(dir);
			
			if(!dirent.exists()) {
				dirent.mkdir();
			}
			
			File outFile = new File(dir, name);
			
			if(outFile.exists()) {
				outFile.delete();
			}
			
			out = new BufferedOutputStream(new FileOutputStream(outFile));
			
			for(int idx = 0; idx < productinfoList.size(); idx++) {
				String writeStr = productinfoList.get(idx).getProduct_code() + "\t" + productinfoList.get(idx).getProduct_name() + "\t"
				+ productinfoList.get(idx).getUnit_price() + "\t" + productinfoList.get(idx).getClient() + "\t" + productinfoList.get(idx).getNotes() + "\n";
				
				byte[] b = writeStr.getBytes();
				
				out.write(b);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			throw ioe;
		} finally {
			try {
				if(out != null) {
					out.close();
				}
			} catch (Exception e) {
			}
		}
	}
}
