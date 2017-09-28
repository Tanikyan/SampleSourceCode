package com.example.samplesourcecode;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.example.samplesourcecode.Listener.PlayerJoinEventListener;

public class SampleSourceCode extends JavaPlugin{
	/* おまじない */
	public static Plugin plugin;

	/**
	 * プラグインの起動時に読み込まれるコード。
	 * これがないと起動すらできない。
	 */
	@Override
	public void onEnable() {
		/* おまじない。とりあえず上のと一緒に書いとく。*/
		plugin = this;
		/*
		 * Configをフォルダに生成する。
		 * resourcesの中にconfig.ymlを作って生成したいConfigの中身を書く
		 */
		// saveDefaultConfig();

		// イベントを登録する。これを忘れるとイベントが呼ばれない。
		getServer().getPluginManager().registerEvents(new PlayerJoinEventListener(), plugin);
	}

}
