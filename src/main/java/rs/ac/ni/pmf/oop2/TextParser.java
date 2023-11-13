package rs.ac.ni.pmf.oop2;

public class TextParser
{
	Encoder _encoder;
	Storage _storage;

	public void setEncoder(Encoder encoder)
	{
		_encoder = encoder;
	}

	public void setStorage(Storage storage){
		_storage = storage;
	}

	public String parse(String text)
	{
		String trimmed = text.trim();
		String encoded = _encoder.encode(trimmed);
		_storage.store(encoded);
		return encoded;
	}

}
