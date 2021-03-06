package com.developers.flinganimations

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by Amanjeet Singh on 12/1/18.
 */
class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                val fragment = MenuFragment()
                with(fragment) {
                    val bundle = Bundle()
                    bundle.putString("key", "0")
                    arguments = bundle
                }
                return fragment
            }
            1 -> {
                val fragment = MenuFragment()
                with(fragment) {
                    val bundle = Bundle()
                    bundle.putString("key", "1")
                    arguments = bundle
                }
                return fragment
            }
            2 -> {
                val fragment = MenuFragment()
                with(fragment) {
                    val bundle = Bundle()
                    bundle.putString("key", "2")
                    arguments = bundle
                }
                return fragment
            }
            else -> return MenuFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

}